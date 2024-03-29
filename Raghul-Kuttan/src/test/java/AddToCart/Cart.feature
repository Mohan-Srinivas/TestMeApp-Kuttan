
@tag
Feature: Add to Cart function
  I want to use this template for my feature file

  @ui
  Scenario: The one where the user moves to cart without adding any item in it.
  Given Alex has Login into TestMeApp
  When Alex search particular product like "Headphones"
  And Try to proceed to payment without adding any item in the Cart
  Then TestMEapp Doesn't display Cart Icon

 @Passui
  Scenario: The one where the user moves to cart adding any item in it.
   Given Alex has Login into the TestMeApp
  Given Alex Search a product "Head"
  When He Clicks Find Details Button
  And Add the Product to cart
  Then Click the Cart Icon
  And type the Quantity and click Checkout
  Then The User Redirected to Payments Page and Proceed to pay
  When The payment page is opened
  Then Order details is displayed
  
  
  