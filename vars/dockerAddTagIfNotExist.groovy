def call(image,tag='')
{
  if(!image)
  {
    error "No Docker image in passed in the first argument of dockerAddTagIfNotExist()"
  }
  tag = tag ?: dockerInferTag()
  if(!image.contains(':'))
  {
    image += ":$tag"
  }
  return image
}