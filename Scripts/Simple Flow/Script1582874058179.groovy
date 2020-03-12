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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Launch browser
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

//Navigate to SMB site
WebUI.click(findTestObject('Object Repository/Simple Flow/viewBusiness'))
WebUI.delay(20)
WebUI.click(findTestObject('Object Repository/Simple Flow/navToProd'))

//Location field - Provide the address
WebUI.click(findTestObject('Object Repository/Simple Flow/locationAddress'))

//Address Verification
WebUI.setText(findTestObject('Object Repository/Simple Flow/street'), GlobalVariable.address)

//WebUI.delay(5)
WebUI.sendKeys(findTestObject('Object Repository/Simple Flow/street'), Keys.chord(Keys.ENTER))

//WebUI.sendKeys(findTestObject('null'), GlobalVariable.zipcode)
WebUI.click(findTestObject('Object Repository/Simple Flow/addressFromDropdown'))

WebUI.click(findTestObject('Object Repository/Simple Flow/checkAvailability'))

//Plan selection page - Verifying the text in the page
//WebUI.waitForPageLoad(5)
WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/planPageHeader'), GlobalVariable.planheading)

WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/internetText'), GlobalVariable.internet)

WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/voiceText'), GlobalVariable.voice)

WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/advancedBusinessSolutionText'), GlobalVariable.advancedbusinesssolutions)

//Plan selection page - clicking on the Internet Icon
WebUI.click(findTestObject('Object Repository/Simple Flow/internetIconPlanPage'))

WebUI.click(findTestObject('Object Repository/Simple Flow/voiceIconPlanPage'))

WebUI.click(findTestObject('Object Repository/Simple Flow/letsSubmitButtonPlanPage'))

//Internet Plan page - Selecting the 100Mbps plan
WebUI.click(findTestObject('Object Repository/Simple Flow/plan100selecticon'))

WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/plan100'), GlobalVariable.plan100value)

WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/plan100mbps'), GlobalVariable.plan100speed)

WebUI.scrollToElement(findTestObject('Object Repository/Simple Flow/continueButtonInternetPage'), 3)

WebUI.click(findTestObject('Object Repository/Simple Flow/continueButtonInternetPage'))

//Internet Extra Pack page - Selecting the Communication Package
WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/internetExtraPackHeader'), GlobalVariable.internetextrapackageheader)

WebUI.click(findTestObject('Object Repository/Simple Flow/internetCommunicationPackageSelect'))

WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/internetCommunicationPackageDetails'), GlobalVariable.internetcommunicationpackinfo)

WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/internetCommunicationPackagePrice'), GlobalVariable.internetcommunicationpackprice)

//Validating if the other extra packages are visible on the page along with their package name and price
WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/internetSecurityPack'), GlobalVariable.internetsecurityinfo)

WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/internetSecurityPrice'), GlobalVariable.internetsecurityprice)

WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/internetCompletePack'), GlobalVariable.internetcompleteinfo)

WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/internetCompletePrice'), GlobalVariable.internetcompleteprice)

WebUI.scrollToElement(findTestObject('Object Repository/Simple Flow/submitButtonIntPackPage'), 3)

WebUI.click(findTestObject('Object Repository/Simple Flow/submitButtonIntPackPage'))

//Internet Extra Pack1 page - Selecting the Fax Package
WebUI.click(findTestObject('Object Repository/Simple Flow/faxToEmailSelection'))

WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/faxToEmailDetail'), GlobalVariable.faxinfo)

WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/faxToEmailPrice'), GlobalVariable.faxprice)

//Validating if the other extra packages are visible on the page along with their package name and price
WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/wirelessBackupDetail'), GlobalVariable.wirelessbackupinfo)

WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/wirelessBackupPrice'), GlobalVariable.wirelessbackupprice)

WebUI.scrollToElement(findTestObject('Object Repository/Simple Flow/submitButtonIntExtraPackPage'), 3)

WebUI.click(findTestObject('Object Repository/Simple Flow/submitButtonIntExtraPackPage'))

//Modem Page - Selecting the Modem Rental option
WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/modemPageHeader'), GlobalVariable.modemheader)

WebUI.click(findTestObject('Object Repository/Simple Flow/modemRentalSelection'))

WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/modemRentalDetail'), GlobalVariable.modeminfo)

WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/modemRentalPrice'), GlobalVariable.modemprice)

WebUI.scrollToElement(findTestObject('Object Repository/Simple Flow/submitButtonModemPage'), 3)

WebUI.click(findTestObject('Object Repository/Simple Flow/submitButtonModemPage'))

//Voice Product page - Choosing the business line details plan
WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/voiceHeader'), GlobalVariable.voicepageheader)

WebUI.click(findTestObject('Object Repository/Simple Flow/businessLineSelection'))

WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/businessLineDetail'), GlobalVariable.voicebusinesslineinfo)

WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/businessLinePrice'), GlobalVariable.voicebusinesslineprice)

WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/voiceCloudDetail'), GlobalVariable.voicecloudbasedinfo)

WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/voiceCloudPrice'), GlobalVariable.voicecloudbasedprice)

WebUI.scrollToElement(findTestObject('Object Repository/Simple Flow/submitButtonVoicePage'), 3)

WebUI.click(findTestObject('Object Repository/Simple Flow/submitButtonVoicePage'))

//Adding the phone numbers and moving to the checkout page
WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/phoneNumberHeader'), GlobalVariable.phoneheader)

WebUI.click(findTestObject('Object Repository/Simple Flow/firstNumberBox'))

WebUI.setText(findTestObject('Object Repository/Simple Flow/firstNumberBox'), GlobalVariable.firstnumber)

WebUI.click(findTestObject('Object Repository/Simple Flow/secondNumberBox'))

WebUI.setText(findTestObject('Object Repository/Simple Flow/secondNumberBox'), GlobalVariable.secondnumber)

WebUI.click(findTestObject('Object Repository/Simple Flow/thirdNumberBox'))

WebUI.setText(findTestObject('Object Repository/Simple Flow/thirdNumberBox'), GlobalVariable.thirdnumber)

WebUI.scrollToElement(findTestObject('Object Repository/Simple Flow/submitButtonNumberPage'), 3)

WebUI.click(findTestObject('Object Repository/Simple Flow/submitButtonNumberPage'))

//Page to add the advanced business solution option - Skip the option
WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/optionToAddBusinessSolution'), GlobalVariable.addbusinesssolution)

WebUI.scrollToElement(findTestObject('Object Repository/Simple Flow/skipLinkForAddingBusinessSolution'), 3)

WebUI.click(findTestObject('Object Repository/Simple Flow/skipLinkForAddingBusinessSolution'))

//CheckOut page
WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/checkoutHeader'), GlobalVariable.checkoutheader)

//Verifying if the cart is shown on the RHS along with product details/discount & bill value
WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/cartHeader'), GlobalVariable.productcart)

WebUI.verifyElementText(findTestObject('Simple Flow/cartInternetProduct'), GlobalVariable.cartIntp)

WebUI.verifyElementText(findTestObject('Simple Flow/cartKineticInternetProduct'), GlobalVariable.cartkineticp)

WebUI.verifyElementText(findTestObject('Simple Flow/cartKineticSpeedProduct'), GlobalVariable.cartkineticspeedp)

WebUI.verifyElementText(findTestObject('Simple Flow/cartKineticPriceProduct'), GlobalVariable.cartkineticpricep)

WebUI.verifyElementText(findTestObject('Simple Flow/cartAddOn'), GlobalVariable.cartaddonsp)

WebUI.verifyElementText(findTestObject('Simple Flow/cartCommunicationPackProduct'), GlobalVariable.cartcommp)

WebUI.verifyElementText(findTestObject('Simple Flow/cartCommunicationPriceProduct'), GlobalVariable.cartcommpricep)

WebUI.verifyElementText(findTestObject('Simple Flow/cartAdditionalAddOns'), GlobalVariable.cartadditionaladdonp)

WebUI.verifyElementText(findTestObject('Simple Flow/cartFaxToEmailProduct'), GlobalVariable.cartfaxtoemailp)

WebUI.verifyElementText(findTestObject('Simple Flow/cartFaxToEmailPriceProduct'), GlobalVariable.cartfaxtoemailpricep)

WebUI.verifyElementText(findTestObject('Simple Flow/cartEquipment'), GlobalVariable.cartequipp)

WebUI.verifyElementText(findTestObject('Simple Flow/cartModemProduct'), GlobalVariable.cartmodemp)

WebUI.verifyElementText(findTestObject('Simple Flow/cart ModemPriceProduct'), GlobalVariable.cartmodempricep)

WebUI.verifyElementText(findTestObject('Simple Flow/cartVoiceProduct'), GlobalVariable.cartvoicep)

WebUI.verifyElementText(findTestObject('Simple Flow/cartBusinessLineProduct'), GlobalVariable.cartbusinesslinep)

WebUI.verifyElementText(findTestObject('Simple Flow/cartBusinessLinePriceProduct'), GlobalVariable.cartbusinesslinepricep)

WebUI.verifyElementText(findTestObject('Simple Flow/cartOneTimeCharge'), GlobalVariable.cartotcp)

WebUI.verifyElementText(findTestObject('Simple Flow/cartActivationFeeProduct'), GlobalVariable.cartactivationp)

WebUI.verifyElementText(findTestObject('Simple Flow/cartActivationFee'), GlobalVariable.cartactivationfeep)

WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/bundleDiscount'), GlobalVariable.discounts)

WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/totalBillInfo'), GlobalVariable.totalbill)

WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/totalBillPrice'), GlobalVariable.totalbillamt)

WebUI.click(findTestObject('Object Repository/Simple Flow/checkoutButton'))

//Contact Information page
WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/contactBillingHeader'), GlobalVariable.contactbillinginfo)

WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/contactInformation'), GlobalVariable.contactinfo)

WebUI.click(findTestObject('Object Repository/Simple Flow/firstName'))

WebUI.setText(findTestObject('Object Repository/Simple Flow/firstName'), GlobalVariable.firstn)

WebUI.click(findTestObject('Object Repository/Simple Flow/lastName'))

WebUI.setText(findTestObject('Object Repository/Simple Flow/lastName'), GlobalVariable.lastn)

WebUI.click(findTestObject('Object Repository/Simple Flow/contactNumber'))

WebUI.setText(findTestObject('Object Repository/Simple Flow/contactNumber'), GlobalVariable.contact)

WebUI.click(findTestObject('Object Repository/Simple Flow/emailAddress'))

WebUI.setText(findTestObject('Object Repository/Simple Flow/emailAddress'), GlobalVariable.emailid)

//Providing the business details
WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/businessInfoHeader'), GlobalVariable.businessheader)

//WebUI.scrollToElement(findTestObject(null), 1)
WebUI.click(findTestObject('Object Repository/Simple Flow/businessName'))

WebUI.setText(findTestObject('Object Repository/Simple Flow/businessName'), GlobalVariable.businessn)

WebUI.click(findTestObject('Object Repository/Simple Flow/businessFedNumber'))

WebUI.setText(findTestObject('Object Repository/Simple Flow/businessFedNumber'), GlobalVariable.businessfedno)

WebUI.click(findTestObject('Object Repository/Simple Flow/noOfEmp'))

WebUI.setText(findTestObject('Object Repository/Simple Flow/noOfEmp'), GlobalVariable.totalemp)

WebUI.click(findTestObject('Object Repository/Simple Flow/noOfLoc'))

WebUI.setText(findTestObject('Object Repository/Simple Flow/noOfLoc'), GlobalVariable.totalloc)

//WebUI.scrollToElement(findTestObject(null), 3)
//Choosing the billing address
WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/billingAddressHeader'), GlobalVariable.billingheader)

WebUI.click(findTestObject('Object Repository/Simple Flow/billingAddressSelection'))

WebUI.click(findTestObject('Object Repository/Simple Flow/submitButtonFinalPage'))

//Selecting the installion date
WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/installationDate'), GlobalVariable.installdate)

WebUI.click(findTestObject('Object Repository/Simple Flow/installationDatePicker'))

WebUI.click(findTestObject('Object Repository/Simple Flow/moveToNextMonth'))

WebUI.click(findTestObject('Object Repository/Simple Flow/aprDate'))

WebUI.click(findTestObject('Object Repository/Simple Flow/buttonDatePicker'))

WebUI.click(findTestObject('Object Repository/Simple Flow/submitButtonDatePage'))

//Terms & Condition Page
WebUI.verifyElementText(findTestObject('Object Repository/Simple Flow/termsAndCondition'), GlobalVariable.termscondition)

WebUI.click(findTestObject('Object Repository/Simple Flow/termsAndConditionSelection'))

