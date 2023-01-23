# Project in Allure TestOps with manual & automated tests
<a target="_blank" href="https://allure.autotests.cloud/project/1830/">allure.autotests.cloud/project/1830</a> (ask admin@qa.guru for access)

# Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/08-murugka31-ZvukSite/">jenkins.autotests.cloud/job/08-murugka31-ZvukSite/</a>

# USAGE examples

### For run remote tests need fill remote.properties or to pass value:

* browser (default chrome)
* browserVersion (default 100.0)
* browserSize (default 2100x1080)

Run tests with filled remote.properties:
```bash
gradle clean test
```

Run tests with not filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/  test
```

Serve report:
```bash
allure serve build/allure-results
```

:heart: <a target="_blank" href="https://github.com/murugka31">github.com/murugka31</a><br/>

