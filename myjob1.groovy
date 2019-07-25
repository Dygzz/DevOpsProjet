job('My Job 1') {
    scm {
        git('https://github.com/Dygzz/DevOpsProjet/tree/Version_1') {  node -> 
            node / gitConfigName('test  ')
            node / gitConfigEmail('diegolehen@gmail.com')
        }
    }
    triggers {
        scm('H/10 * * * *')
    }
    wrappers {
        php('PHP:fpm')
    }
    steps {
        shell("docker-compose up")
    }
}