@Library('ci_shared_library')

import ci.devops.aldanangel.pipelines.build_ci_shared_library

def pipeline = new build_ci_shared_library()

pipeline.execute(
    message: 'PIPELINE',
    appName: 'gps-talent-proyect',
    repository: 'aws_dev',
    type: 'lambda',
    template: 'application/template.yaml'
)
