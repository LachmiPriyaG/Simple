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
WebUI.click(findTestObject('viewBusiness'))

WebUI.click(findTestObject('navToProd'))

//Location field - Provide the address
WebUI.click(findTestObject('locationAddress'))

//Address Verification
WebUI.setText(findTestObject('street'), GlobalVariable.address)

//WebUI.delay(5)
WebUI.sendKeys(findTestObject('street'), Keys.chord(Keys.ENTER))

//WebUI.sendKeys(findTestObject('null'), GlobalVariable.zipcode)
WebUI.click(findTestObject('addressFromDropdown'))

WebUI.click(findTestObject('checkAvailability'))

//Plan selection page - Verifying the text in the page
//WebUI.waitForPageLoad(5)
WebUI.verifyElementText(findTestObject('planPageHeader'), GlobalVariable.planheading)

WebUI.verifyElementText(findTestObject('internetText'), GlobalVariable.internet)

WebUI.verifyElementText(findTestObject('voiceText'), GlobalVariable.voice)

WebUI.verifyElementText(findTestObject('advancedBusinessSolutionText'), GlobalVariable.advancedbusinesssolutions)

//Plan selection page - clicking on the Internet Icon
WebUI.click(findTestObject('internetIconPlanPage'))

WebUI.click(findTestObject('voiceIconPlanPage'))

WebUI.click(findTestObject('letsSubmitButtonPlanPage'))

//Internet Plan page - Selecting the 100Mbps plan
WebUI.click(findTestObject('plan100selecticon'))

WebUI.verifyElementText(findTestObject('plan100'), GlobalVariable.plan100value)

WebUI.verifyElementText(findTestObject('plan100mbps'), GlobalVariable.plan100speed)

WebUI.scrollToElement(findTestObject('continueButtonInternetPage'), 3)

WebUI.click(findTestObject('continueButtonInternetPage'))

//Internet Extra Pack page - Selecting the Communication Package
WebUI.verifyElementText(findTestObject('internetExtraPackHeader'), GlobalVariable.internetextrapackageheader)

WebUI.click(findTestObject('internetCommunicationPackageSelect'))

WebUI.verifyElementText(findTestObject('internetCommunicationPackageDetails'), GlobalVariable.internetcommunicationpackinfo)

WebUI.verifyElementText(findTestObject('internetCommunicationPackagePrice'), GlobalVariable.internetcommunicationpackprice)

//Validating if the other extra packages are visible on the page along with their package name and price
WebUI.verifyElementText(findTestObject('internetSecurityPack'), GlobalVariable.internetsecurityinfo)

WebUI.verifyElementText(findTestObject('internetSecurityPrice'), GlobalVariable.internetsecurityprice)

WebUI.verifyElementText(findTestObject('internetCompletePack'), GlobalVariable.internetcompleteinfo)

WebUI.verifyElementText(findTestObject('internetCompletePrice'), GlobalVariable.internetcompleteprice)

WebUI.scrollToElement(findTestObject('submitButtonIntPackPage'), 3)

WebUI.click(findTestObject('submitButtonIntPackPage'))

//Internet Extra Pack1 page - Selecting the Fax Package
WebUI.click(findTestObject('faxToEmailSelection'))

WebUI.verifyElementText(findTestObject('faxToEmailDetail'), GlobalVariable.faxinfo)

WebUI.verifyElementText(findTestObject('faxToEmailPrice'), GlobalVariable.faxprice)

//Validating if the other extra packages are visible on the page along with their package name and price
WebUI.verifyElementText(findTestObject('wirelessBackupDetail'), GlobalVariable.wirelessbackupinfo)

WebUI.verifyElementText(findTestObject('wirelessBackupPrice'), GlobalVariable.wirelessbackupprice)

WebUI.scrollToElement(findTestObject('submitButtonIntExtraPackPage'), 3)

WebUI.click(findTestObject('submitButtonIntExtraPackPage'))

//Modem Page - Selecting the Modem Rental option
WebUI.verifyElementText(findTestObject('modemPageHeader'), GlobalVariable.modemheader)

WebUI.click(findTestObject('modemRentalSelection'))

WebUI.verifyElementText(findTestObject('modemRentalDetail'), GlobalVariable.modeminfo)

WebUI.verifyElementText(findTestObject('modemRentalPrice'), GlobalVariable.modemprice)

WebUI.scrollToElement(findTestObject('submitButtonModemPage'), 3)

WebUI.click(findTestObject('submitButtonModemPage'))

//Voice Product page - Choosing the business line details plan
WebUI.verifyElementText(findTestObject('voiceHeader'), GlobalVariable.voicepageheader)

WebUI.click(findTestObject('businessLineSelection'))

WebUI.verifyElementText(findTestObject('businessLineDetail'), GlobalVariable.voicebusinesslineinfo)

WebUI.verifyElementText(findTestObject('businessLinePrice'), GlobalVariable.voicebusinesslineprice)

WebUI.verifyElementText(findTestObject('voiceCloudDetail'), GlobalVariable.voicecloudbasedinfo)

WebUI.verifyElementText(findTestObject('voiceCloudPrice'), GlobalVariable.voicecloudbasedprice)

WebUI.scrollToElement(findTestObject('submitButtonVoicePage'), 3)

WebUI.click(findTestObject('submitButtonVoicePage'))

//Adding the phone numbers and moving to the checkout page
WebUI.verifyElementText(findTestObject('phoneNumberHeader'), GlobalVariable.phoneheader)

WebUI.click(findTestObject('firstNumberBox'))

WebUI.setText(findTestObject('firstNumberBox'), GlobalVariable.firstnumber)

WebUI.click(findTestObject('secondNumberBox'))

WebUI.setText(findTestObject('secondNumberBox'), GlobalVariable.secondnumber)

WebUI.click(findTestObject('thirdNumberBox'))

WebUI.setText(findTestObject('thirdNumberBox'), GlobalVariable.thirdnumber)

WebUI.scrollToElement(findTestObject('submitButtonNumberPage'), 3)

WebUI.click(findTestObject('submitButtonNumberPage'))

//Page to add the advanced business solution option - Skip the option
WebUI.verifyElementText(findTestObject('optionToAddBusinessSolution'), GlobalVariable.addbusinesssolution)

WebUI.scrollToElement(findTestObject('skipLinkForAddingBusinessSolution'), 3)

WebUI.click(findTestObject('skipLinkForAddingBusinessSolution'))

//CheckOut page
WebUI.verifyElementText(findTestObject('checkoutHeader'), GlobalVariable.checkoutheader)

//Verifying if the cart is shown on the RHS along with product details/discount & bill value
WebUI.verifyElementText(findTestObject('cartHeader'), GlobalVariable.productcart)

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

WebUI.verifyElementText(findTestObject('bundleDiscount'), GlobalVariable.discounts)

WebUI.verifyElementText(findTestObject('totalBillInfo'), GlobalVariable.totalbill)

WebUI.verifyElementText(findTestObject('totalBillPrice'), GlobalVariable.totalbillamt)

WebUI.click(findTestObject('checkoutButton'))

//Contact Information page
WebUI.verifyElementText(findTestObject('contactBillingHeader'), GlobalVariable.contactbillinginfo)

WebUI.verifyElementText(findTestObject('contactInformation'), GlobalVariable.contactinfo)

WebUI.click(findTestObject('firstName'))

WebUI.setText(findTestObject('firstName'), GlobalVariable.firstn)

WebUI.click(findTestObject('lastName'))

WebUI.setText(findTestObject('lastName'), GlobalVariable.lastn)

WebUI.click(findTestObject('contactNumber'))

WebUI.setText(findTestObject('contactNumber'), GlobalVariable.contact)

WebUI.click(findTestObject('emailAddress'))

WebUI.setText(findTestObject('emailAddress'), GlobalVariable.emailid)

//Providing the business details
WebUI.verifyElementText(findTestObject('businessInfoHeader'), GlobalVariable.businessheader)

//WebUI.scrollToElement(findTestObject(null), 1)
WebUI.click(findTestObject('businessName'))

WebUI.setText(findTestObject('businessName'), GlobalVariable.businessn)

WebUI.click(findTestObject('businessFedNumber'))

WebUI.setText(findTestObject('businessFedNumber'), GlobalVariable.businessfedno)

WebUI.click(findTestObject('noOfEmp'))

WebUI.setText(findTestObject('noOfEmp'), GlobalVariable.totalemp)

WebUI.click(findTestObject('noOfLoc'))

WebUI.setText(findTestObject('noOfLoc'), GlobalVariable.totalloc)

//WebUI.scrollToElement(findTestObject(null), 3)
//Choosing the billing address
WebUI.verifyElementText(findTestObject('billingAddressHeader'), GlobalVariable.billingheader)

WebUI.click(findTestObject('billingAddressSelection'))

WebUI.click(findTestObject('submitButtonFinalPage'))

//Selecting the installion date
WebUI.verifyElementText(findTestObject('installationDate'), GlobalVariable.installdate)

WebUI.click(findTestObject('installationDatePicker'))

WebUI.click(findTestObject('moveToNextMonth'))

WebUI.click(findTestObject('aprDate'))

WebUI.click(findTestObject('buttonDatePicker'))

WebUI.click(findTestObject('submitButtonDatePage'))

//Terms & Condition Page
WebUI.verifyElementText(findTestObject('termsAndCondition'), GlobalVariable.termscondition)

WebUI.click(findTestObject('termsAndConditionSelection'))

