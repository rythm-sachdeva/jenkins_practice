def call()
{
    return tag ?: 
            env.DOCKER_TAG ?:
            env.CONTAINER_TAG ?:
            env.VERSION ?:
            env.GIT_COMMIT ?: 
            'latest'
}