package universalOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;
import com.web365.universalorder.am.page.productList.UniversalorderBarsProductsPage;
import com.web365.universalorder.am.page.productList.UniversalorderDesktopShowcaseProductsPage;
import com.web365.universalorder.am.page.productList.UniversalorderNeutralEquipmentProductsPage;
import com.web365.universalorder.am.page.productList.UniversalorderRefrigeratedTablesProductsPage;
import com.web365.universalorder.am.page.productList.UniversalorderSpecialEquipmentProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderBoilersPage;
import com.web365.universalorder.am.page.productList.UniversalOrderCanopyProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderContactProcessingApparatusProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderConvectionOvensPage;
import com.web365.universalorder.am.page.productList.UniversalOrderDishwashersProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderDistributionOfLineASTAProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderDistributionOfLinePATSHAProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderDistributionOfLinePREMERProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderElectromechanicalProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderElectronicStovesProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderGasEquipmentProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderInductionCookersProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderKettlesAndCountertopFryersProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderMiniDistributionLineProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderOvensProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderParakombiOvensPage;
import com.web365.universalorder.am.page.productList.UniversalOrderPizzaOvensProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderProofingCabinetsAndChambersProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderRefrigeratedCabinetsProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderRotaryOvensProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderSelfServiceLineProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderShockFreezingGeneratorsProductsPage;
import com.web365.universalorder.am.page.productList.UniversalorderAccessoriesProductsPage;

import universalOrder.base.UniversalOrderBaseTest;

public class OurProductsListFromHomePageTest extends UniversalOrderBaseTest {
	
	
@Test
public void paracombiproductTest() throws InterruptedException { //????????????????????????????????
//1.UniversalOrder.am is open
	UniversalOrderParakombiOvensPage paracombi = new UniversalOrderParakombiOvensPage(driver);
	UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
	Thread.sleep(2000);
//2.Click on ???????????????????????????????? Link
  paracombi=home.goToParacombiOvenProductList();

  @SuppressWarnings("deprecation")
	WebDriverWait w1 = new WebDriverWait(driver,3);
// presenceOfElementLocated condition

w1.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1430/475.jpg']")));
 
Assert.assertTrue(paracombi.paracombiovensproducts.isDisplayed());
   home = home.logoClick();
}

@Test
public void convectionproductsTest() throws InterruptedException { //?????????????????????????? ????????
//1.UniversalOrder.am is open
	UniversalOrderConvectionOvensPage convectionproducts = new UniversalOrderConvectionOvensPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
 //2.Click on ?????????????????????????? ???????? Link
  convectionproducts=home.goToConvectionOvensProductList();

  @SuppressWarnings("deprecation")
 	WebDriverWait w = new WebDriverWait(driver,3);
   // presenceOfElementLocated condition
   
   w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1431/476.jpg']")));
  Assert.assertTrue(convectionproducts.convectionpageverifyxpath.isDisplayed());
  home = home.logoClick();
}
@Test
public void boilersproductsTest() throws InterruptedException { //??????????
//1.UniversalOrder.am is open
	UniversalOrderBoilersPage boilersproducts = new UniversalOrderBoilersPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
 //2. Click on ?????????? Link
  boilersproducts=home.goToBoliersProductList();
@SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
  // presenceOfElementLocated condition
   w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1432/480.jpg']")));
  Assert.assertTrue(boilersproducts.boilerspageverifyxpath.isDisplayed());
  home = home.logoClick();
  
}
@Test
public void dishwasherProductsTest() throws InterruptedException { //?????????????????????????? ????????????
//1.UniversalOrder.am is open
	UniversalOrderDishwashersProductsPage dishwasherproducts = new UniversalOrderDishwashersProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on ?????????????????????????? ???????????? Link
  dishwasherproducts=home.goToDishwasherProductsList();
  @SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
 // presenceOfElementLocated condition
  w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1433/484.jpg']")));
  Assert.assertTrue(dishwasherproducts.dishwasherPageVerify.isDisplayed());
  home = home.logoClick();
}
@Test
public void electromechanicalProductsTest() throws InterruptedException { //?????????????????????????????????????? ????????????????????????
//1.UniversalOrder.am is open
	UniversalOrderElectromechanicalProductsPage electromechanicalproducts = new UniversalOrderElectromechanicalProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on ?????????????????????????????????????? ???????????????????????? Link
  electromechanicalproducts=home.goToElectromechanicalProductsList();
  @SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
// presenceOfElementLocated condition
w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1434/488.jpg']")));
  Assert.assertTrue(electromechanicalproducts.electromechanicalProductPageVerify.isDisplayed());
home = home.logoClick();
}
@Test
public void roteryOvensProductsTest() throws InterruptedException { //?????????????????????? ?????????????????? ??????????
//1.UniversalOrder.am is open
	UniversalOrderRotaryOvensProductsPage roteryOvensproducts = new UniversalOrderRotaryOvensProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on ?????????????????????? ?????????????????? ?????????? Link
  roteryOvensproducts=home.goToRotaryOvensProductsList();
 @SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
//presenceOfElementLocated condition

w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1435/492.jpg']")));
  Assert.assertTrue(roteryOvensproducts.roteryOvensProductPageVerify.isDisplayed());
  home = home.logoClick();
}
@Test
public void shockFreezingGeneratorsProductsList() throws InterruptedException { //?????????????? ??????????????????, ????????????????????????????
//1.UniversalOrder.am is open
	UniversalOrderShockFreezingGeneratorsProductsPage shockfreezinggeneratorsproducts = new UniversalOrderShockFreezingGeneratorsProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on ?????????????? ??????????????????, ???????????????????????????? Link
  shockfreezinggeneratorsproducts=home.goToShockFreezingGeneratorsProductsList();
@SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
//presenceOfElementLocated condition

w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1436/495.jpg']")));
  Assert.assertTrue(shockfreezinggeneratorsproducts.shockfreezinggenerationpageverifyxpath.isDisplayed());
  home = home.logoClick();
}
@Test
public void refrigeratedCabinetsProductsList() throws InterruptedException { //?????????????????????? ??????????
//1.UniversalOrder.am is open
	UniversalOrderRefrigeratedCabinetsProductsPage refrigeratedCabinetsProductsList = new UniversalOrderRefrigeratedCabinetsProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on ?????????????????????? ?????????? Link
  refrigeratedCabinetsProductsList=home.goToRefrigeratedCabinetsProductsList();
  @SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
//presenceOfElementLocated condition
w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1437/497.jpg']")));
  Assert.assertTrue(refrigeratedCabinetsProductsList.refrigiratedCabinetsPageVerify.isDisplayed());
  home = home.logoClick();
}
@Test
public void contactProcessingApparatusProductsList() throws InterruptedException { //?????????????????? ?? ???????????????? ???????????????????? ??????????????????
//1.UniversalOrder.am is open
	UniversalOrderContactProcessingApparatusProductsPage contactProcessingApparatusProductsList = new UniversalOrderContactProcessingApparatusProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on ?????????????????? ?? ???????????????? ???????????????????? ?????????????????? Link
  contactProcessingApparatusProductsList = home.goToContactProcessingApparatusProductsList();
  @SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
//presenceOfElementLocated condition
w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1438/500.jpg']")));
  Assert.assertTrue(contactProcessingApparatusProductsList.contactProcessingApparatusPageVerify.isDisplayed());
 home = home.logoClick();
}
@Test
public void electronicStovesProductsList() throws InterruptedException { //?????????????????????????? ??????????
//1.UniversalOrder.am is open
	UniversalOrderElectronicStovesProductsPage electronicStovesProductsList = new UniversalOrderElectronicStovesProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on ?????????????????????????? ?????????? Link
  electronicStovesProductsList = home.goToElectronicStovesProductsList();
  @SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
//presenceOfElementLocated condition
w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1439/504.jpg']")));
  Assert.assertTrue(electronicStovesProductsList.electronicStovesPageVerify.isDisplayed());
 home = home.logoClick();
}
@Test
public void inductionCookersProductsList() throws InterruptedException { ////???????????????????????? ??????????
//1.UniversalOrder.am is open
	UniversalOrderInductionCookersProductsPage inductionCookersProductsList = new UniversalOrderInductionCookersProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on ???????????????????????? ?????????? Link
  inductionCookersProductsList = home.goToInductionCookersProductsList();
   home = home.logoClick();
}
@Test
public void gasEquipmentProductsList() throws InterruptedException { //?????????????? ????????????????????????
//1.UniversalOrder.am is open
	UniversalOrderGasEquipmentProductsPage gasEquipmentProductsList = new UniversalOrderGasEquipmentProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on ?????????????? ???????????????????????? Link
  gasEquipmentProductsList = home.goToGasEquipmentProductsList();
  @SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
//presenceOfElementLocated condition
w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1441/506.jpg']")));
  Assert.assertTrue(gasEquipmentProductsList.gasEquipmentPageVerify.isDisplayed());
 home = home.logoClick();
}
@Test
public void pizzaOvensProductsList() throws InterruptedException { //???????? ?????? ??????????
//1.UniversalOrder.am is open
	UniversalOrderPizzaOvensProductsPage pizzaOvensProductsList = new UniversalOrderPizzaOvensProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on ???????? ?????? ?????????? Link
  pizzaOvensProductsList = home.goToPizzaOvensProductsList();
  @SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
//presenceOfElementLocated condition
w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1445/541.jpg']")));
  Assert.assertTrue(pizzaOvensProductsList.pizzaOvensPageVerify.isDisplayed());
 home = home.logoClick();
}
@Test
public void ovensProductsList() throws InterruptedException { //?????????? ?????????????????? ?? ????????????????
//1.UniversalOrder.am is open
	UniversalOrderOvensProductsPage ovensProductsList = new UniversalOrderOvensProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on ?????????? ?????????????????? ?? ???????????????? Link
  ovensProductsList = home.goToOvensProductsList();
  @SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
//presenceOfElementLocated condition
w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1446/543.jpg']")));
  Assert.assertTrue(ovensProductsList.ovenspageverify.isDisplayed());
 home = home.logoClick();
}
@Test
public void proofingCabinetsAndChambersProductsLink() throws InterruptedException { //?????????????????????? ?????????? ?? ????????????
//1.UniversalOrder.am is open
	UniversalOrderProofingCabinetsAndChambersProductsPage proofingCabinetsAndChambersProductsLink = new UniversalOrderProofingCabinetsAndChambersProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on ?????????????????????? ?????????? ?? ???????????? Link
  proofingCabinetsAndChambersProductsLink = home.goToProofingCabinetsAndChambersProductsList();
 home = home.logoClick();
}
@Test
public void universalOrderKettlesAndCountertopFryersProductsTest() throws InterruptedException { //???????????????????????? ?? ???????????????????? ????????????????????
//1.UniversalOrder.am is open
	UniversalOrderKettlesAndCountertopFryersProductsPage universalOrderKettlesAndCountertopFryersProduct = new UniversalOrderKettlesAndCountertopFryersProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on ???????????????????????? ?? ???????????????????? ???????????????????? Link
  universalOrderKettlesAndCountertopFryersProduct=home.goToKettlesAndCountertopFryersProductsList();
 @SuppressWarnings("deprecation")
 	WebDriverWait w = new WebDriverWait(driver,3);
 //presenceOfElementLocated condition
 w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1448/546.jpg']")));
   Assert.assertTrue(universalOrderKettlesAndCountertopFryersProduct.kettlesAndCountertopPageVerify.isDisplayed());
  home = home.logoClick();
}
@Test
public void universalOrderMiniDistributionLineProductsTest() throws InterruptedException { //????????-?????????? ??????????????
//1.UniversalOrder.am is open
	UniversalOrderMiniDistributionLineProductsPage universalOrderMiniDistributionLineProduct = new UniversalOrderMiniDistributionLineProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on ????????-?????????? ?????????????? Link
  universalOrderMiniDistributionLineProduct=home.goToMiniDistributionLineProductList();
 home = home.logoClick();
}
@Test
public void universalOrderDistributionOfLineASTAPProductsTest() throws InterruptedException { //?????????? ?????????????? "????????"
//1.UniversalOrder.am is open
	UniversalOrderDistributionOfLineASTAProductsPage distributionOfLineASTAPProducts = new UniversalOrderDistributionOfLineASTAProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on ?????????? ?????????????? "????????" Link
  distributionOfLineASTAPProducts=home.goTodistributionOfLineASTAPProductList();
  @SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
//presenceOfElementLocated condition
w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1450/549.jpg']")));
 Assert.assertTrue(distributionOfLineASTAPProducts.distributionOfLinePageVerify.isDisplayed());
home = home.logoClick();
}
@Test
public void universalOrderDistributionOfLinePATSHAProductsTest() throws InterruptedException { //?????????? ?????????????? "??????????"
//1.UniversalOrder.am is open
	UniversalOrderDistributionOfLinePATSHAProductsPage distributionOfLinePATSHAProducts = new UniversalOrderDistributionOfLinePATSHAProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on ?????????? ?????????????? "??????????" Link
  distributionOfLinePATSHAProducts=home.goTodistributionOfLinePATSHAProductList();
  @SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
//presenceOfElementLocated condition
w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1451/566.jpg']")));
 Assert.assertTrue(distributionOfLinePATSHAProducts.distributionOfLinePATSHAPageVerify.isDisplayed());
home = home.logoClick();
}
@Test
public void universalOrderDistributionOfLinePREMERProductsTest() throws InterruptedException { //?????????? ?????????????? "??????????????"
//1.UniversalOrder.am is open
	UniversalOrderDistributionOfLinePREMERProductsPage distributionOfLinePREMERProducts = new UniversalOrderDistributionOfLinePREMERProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on ?????????? ?????????????? "??????????????" Link
  distributionOfLinePREMERProducts=home.goTodistributionOfLinePREMERProductList();
  @SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
//presenceOfElementLocated condition
w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1452/575.jpg']")));
 Assert.assertTrue(distributionOfLinePREMERProducts.distributionOfLinePREMERPageVerify.isDisplayed());
home = home.logoClick();
}
@Test
public void universalOrderSelfServiceLineProductsTest() throws InterruptedException { //?????????? ???????????????????????????????? ??????????????????????
//1.UniversalOrder.am is open
	UniversalOrderSelfServiceLineProductsPage selfServiceLineProducts = new UniversalOrderSelfServiceLineProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on ?????????? ???????????????????????????????? ?????????????????????? Link
  selfServiceLineProducts=home.goToSelfServiceLineProductList();
  home = home.logoClick();
}
@Test
public void barsProductsTest() throws InterruptedException { //??????????-????????
//1.UniversalOrder.am is open
	UniversalorderBarsProductsPage barsProducts = new UniversalorderBarsProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on ??????????-???????? Link
  barsProducts=home.goToBarsProductList();
  home = home.logoClick();
}
@Test
public void refrigeratedTablesProductTest() throws InterruptedException { //?????????????????????? ??????????
//1.UniversalOrder.am is open
	UniversalorderRefrigeratedTablesProductsPage refrigeratedTablesProducts = new UniversalorderRefrigeratedTablesProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on ?????????????????????? ?????????? Link
  refrigeratedTablesProducts=home.goToRefrigeratedTablesProductList();
  home = home.logoClick();
}
@Test
public void desktopShowcaseProductTest() throws InterruptedException { //???????????????????? ??????????????
//1.UniversalOrder.am is open
	UniversalorderDesktopShowcaseProductsPage desktopShowcaseProducts = new UniversalorderDesktopShowcaseProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on ???????????????????? ?????????????? Link
  desktopShowcaseProducts=home.goToDesktopShowcaseProductList();
  home = home.logoClick();
}
@Test
public void neutralEquipmentProductTest() throws InterruptedException { //?????????????????????? ????????????????????????
//1.UniversalOrder.am is open
	UniversalorderNeutralEquipmentProductsPage neutralEquipmentProducts = new UniversalorderNeutralEquipmentProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on ?????????????????????? ???????????????????????? Link
  neutralEquipmentProducts=home.goToNeutralEquipmentProductList();
  @SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
//presenceOfElementLocated condition
w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1457/588.jpg']")));
Assert.assertTrue(neutralEquipmentProducts.neutralEquipmentPageVerify.isDisplayed());
home = home.logoClick();
}
@Test
public void accessoriesProductTest() throws InterruptedException { //????????????????????
//1.UniversalOrder.am is open
	UniversalorderAccessoriesProductsPage accessoriesProducts = new UniversalorderAccessoriesProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on ???????????????????? Link
  accessoriesProducts=home.goToAccessoriesProductList();
  @SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
//presenceOfElementLocated condition
w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1458/591.jpg']")));
Assert.assertTrue(accessoriesProducts.accessoriespageverifyxpath.isDisplayed());
home = home.logoClick();
 }
@Test
public void specialEquipmentProductTest() throws InterruptedException {//?????????????????????? ????????????????????????
	UniversalorderSpecialEquipmentProductsPage specialEquipmentProducts = new UniversalorderSpecialEquipmentProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on ?????????????????????? ???????????????????????? Link
  specialEquipmentProducts=home.goToSpecialEquipmentProductList();
  @SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
//presenceOfElementLocated condition
w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1459/599.jpg']")));
Assert.assertTrue(specialEquipmentProducts.specialEquipmentpageverifyxpath.isDisplayed());
home = home.logoClick();

}
}