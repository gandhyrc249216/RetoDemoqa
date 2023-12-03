import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory

WebUI.openBrowser('')

/**
 * Resolución del problema del zoom 
 * https://forum.katalon.com/t/chrome-set-browser-zoom/10667/6
 */

WebDriver driver= DriverFactory.getWebDriver()

driver.get('https://demoqa.com/')

WebUI.delay(10)

driver.manage().window().maximize()

driver.get('chrome://settings/')

((JavascriptExecutor)driver).executeScript('chrome.settingsPrivate.setDefaultZoom(0.6);')

WebUI.navigateToUrl('https://demoqa.com/')

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('FormularioIframe/h5_Forms'), 0)

WebUI.click(findTestObject('Object Repository/FormularioIframe/h5_Forms'))

WebUI.click(findTestObject('Object Repository/FormularioIframe/span_Practice Form'))

WebUI.setText(findTestObject('Object Repository/FormularioIframe/inputfirstName'), 'Gandhy')

WebUI.setText(findTestObject('Object Repository/FormularioIframe/inputlastName'), 'Rosas')

WebUI.setText(findTestObject('Object Repository/FormularioIframe/inputuserEmail'), 'gandhyrc@gmail.com')

WebUI.click(findTestObject('Object Repository/FormularioIframe/label_Female'))

WebUI.setText(findTestObject('Object Repository/FormularioIframe/inputuserNumber'), '5555559866')

WebUI.setText(findTestObject('Object Repository/FormularioIframe/inputdateOfBirthInput'), '02 Dec 2023')

WebUI.click(findTestObject('Object Repository/FormularioIframe/inputdateOfBirthInput'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FormularioIframe/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FormularioIframe/select_190019011902190319041905190619071908_246ee1'), 
    '1986', true)

WebUI.scrollToElement(findTestObject('FormularioIframe/div_23'), 0)

WebUI.click(findTestObject('Object Repository/FormularioIframe/div_23'))

WebUI.click(findTestObject('Object Repository/FormularioIframe/div_subjects-auto-complete__value-container_2eeeca'))

WebUI.setText(findTestObject('Object Repository/FormularioIframe/inputsubjectsInput'), 'Ninguno')

WebUI.click(findTestObject('Object Repository/FormularioIframe/label_Reading'))

WebUI.uploadFile(findTestObject('FormularioIframe/CargaArchivo'), 'C:\\Katalon_proyectos\\Proyecto2\\Archivos\\Perrito.jpg')

WebUI.setText(findTestObject('Object Repository/FormularioIframe/textareacurrentAddress'), 'Conocida')

WebUI.scrollToElement(findTestObject('FormularioIframe/div'), 0)

WebUI.click(findTestObject('Object Repository/FormularioIframe/div'))

WebUI.click(findTestObject('Object Repository/FormularioIframe/div_Select State'))

WebUI.click(findTestObject('Object Repository/FormularioIframe/div_Uttar Pradesh'))

WebUI.click(findTestObject('Object Repository/FormularioIframe/div_Select City'))

WebUI.click(findTestObject('Object Repository/FormularioIframe/button_Submit'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/FormularioIframe/button_Close'))

WebUI.delay(3)

WebUI.closeBrowser()

