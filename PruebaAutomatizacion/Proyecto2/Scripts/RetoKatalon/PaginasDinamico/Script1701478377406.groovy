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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('BookeStore/Page_DEMOQA/h5_Book Store Application'), 0)

WebUI.click(findTestObject('Object Repository/BookeStore/Page_DEMOQA/h5_Book Store Application'))

WebUI.click(findTestObject('Object Repository/BookeStore/Page_DEMOQA/span_Book Store'))

WebUI.click(findTestObject('Object Repository/BookeStore/Page_DEMOQA/a_Understanding ECMAScript 6'))

/**
 * Valido la información con un clik sobre el title cotejando el valor del texto
 * //label[@id = 'userName-value' and (text() = 'Understanding ECMAScript 6' or . = 'Understanding ECMAScript 6')]
 */
WebUI.click(findTestObject('Object Repository/BookeStore/Page_DEMOQA/label_Understanding ECMAScript 6'))

