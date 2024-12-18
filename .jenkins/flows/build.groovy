@Library('ci_shared_library')

import ci.devops.aldanangel.pipelines.build_ci_shared_library

def pipeline = new build_ci_shared_library()

pipeline.execute(
    message: 'PIPELINE',
    appName: 'gps-talent-proyect',
    repository: 'aws_dev',
    type: 'lambda',
    template: 'template.yaml',
    test_directory: 'tests/unit/',
    version: '1.0.0',
    bucket: 'lambdasrepository',
    region: 'us-east-1',
    file: 'packaged'
)
