# Project for Zvuk Site: zvuk.com

[Zvuk](https://zvuk.com/) - это интернет-сервис потокового аудио, позволяющий слушать музыку, подкасты и аудиокниги.

# Project in Allure TestOps with manual & automated tests 
<a target="_blank" href="https://allure.autotests.cloud/project/1830/">allure.autotests.cloud/project/1830</a> 

# Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/08-murugka31-ZvukSite/">jenkins.autotests.cloud/job/08-murugka31-ZvukSite</a>

# Jira Task
<a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-509/">jira.autotests.cloud/browse/HOMEWORK-509</a>

# USAGE examples

### For run remote tests need fill remote.properties or to pass value:

* browser (default chrome)
* browserVersion (default 100.0)
* browserSize (default 2100x1080)
* remoteUrl (selenoid.autotests.cloud/wd/hub/)

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

