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

WebUI.navigateToUrl('https://login.katalon.com/realms/katalon/protocol/openid-connect/auth?client_id=katalon-marketing&response_type=code&scope=openid&redirect_uri=https%3A%2F%2Fkatalon.com%2Fsetup&ref=header_login_btn&referrer_page=https%3A%2F%2Fkatalon.com%2F#')

WebUI.click(findTestObject('Object Repository/logon2/Page_Sign in  Katalon Software Quality Mana_cfddb7/div_Continue with email_1'))

WebUI.setText(findTestObject('Object Repository/logon2/Page_Sign in  Katalon Software Quality Mana_cfddb7/input_Log in with email_username'), 
    'kataloniglo@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/logon2/Page_Sign in  Katalon Software Quality Mana_cfddb7/input_Log in with email_password'), 
    '1uQHKmaGceAjclSD1WUvrw==')

WebUI.click(findTestObject('Object Repository/logon2/Page_Sign in  Katalon Software Quality Mana_cfddb7/input_Log in with email_login'))

WebUI.closeBrowser()

