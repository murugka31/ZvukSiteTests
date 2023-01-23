# Проект для интернет-сервиса zvuk.com

[Zvuk](https://zvuk.com/) - Это аудиосервис, который с вами на одной волне и дополняет каждый момент жизни подходящим звуковым сопровождением.

![2023-01-23_18-46-02](https://user-images.githubusercontent.com/118747260/214087786-09b44311-0acc-479e-9be5-50260fb1d003.png)

## :point_right: Проект в Allure TestOps с ручными и автотестами с результатами их прохождения.
<a target="_blank" href="https://allure.autotests.cloud/project/1830/">allure.autotests.cloud/project/1830</a> 
В Allure TestOps хранится информация по всем ручным и автотестам проекта, по запускам сборок, а также отчет по пройденным сборкам.
![2023-01-23_19-14-41](https://user-images.githubusercontent.com/118747260/214090886-fe2edafd-eae3-44f6-90b0-b559ed019c91.png)

## :point_right:  Jenkins job c Allure Report с результатами пройденной сборки.
<a target="_blank" href="https://jenkins.autotests.cloud/job/08-murugka31-ZvukSite/">jenkins.autotests.cloud/job/08-murugka31-ZvukSite</a>
В Jenkins запускается сборка с параметрами:
*	Браузер (chrome, opera, safari)
* Разрешение браузера (2100x1080,  1920x1080,  1600x1080)
* Версия браузера (100, 99, 98)
* Адрес удаленного браузера

В Allure Report отображается вся информация по пройденной сборке

![2023-01-22_18-40-14](https://user-images.githubusercontent.com/118747260/214093628-b7e2a93d-2222-4d4d-83f4-21b820a91589.png)

## :point_right:  Jira Task с ручными и автотестами с результатами их прохождения.
<a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-509/">jira.autotests.cloud/browse/HOMEWORK-509</a>
![2023-01-23_19-44-54](https://user-images.githubusercontent.com/118747260/214098800-e98c6a22-f339-472d-b7ff-960b29582986.png)

## :point_right: Уведомления о прохождении тестов в Телеграм :v:
Уведомления о прохождении тестов приходит в телеграм канал.

https://user-images.githubusercontent.com/118747260/214099269-1882d210-c20e-4ee1-ab1b-3b3acd69961e.mp4


## :point_right: USAGE examples

### For run remote tests need fill remote.properties or to pass value:

* browser (default chrome)
* browserVersion (default 100.0)
* browserSize (default 2100x1080)
* remoteUrl (selenoid.autotests.cloud/wd/hub/)

Run tests with filled remote.properties:
```bash
gradle clean test
```

Serve report:
```bash
allure serve build/allure-results
```

:heart: <a target="_blank" href="https://github.com/murugka31">github.com/murugka31</a><br/>

