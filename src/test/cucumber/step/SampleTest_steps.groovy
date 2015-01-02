import geb.*
import POC


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)
this.metaClass.mixin(geb.Browser)

//def poc= new POC()
//poc

Given(~'I have navigated to the home page') { ->
	
	def urlstring = new String()
	urlstring='http://www.rackroomshoes.com/welcome.html'
	POC.setTesturl(urlstring)
	to POC
	 
}

When(~'I search for the text (.*)') { String searchQuery->
	
	//"(.*?)"
	searchForProduct(searchQuery)
}

Then(~'I Locate the link in the search results') { ->
	
	assertProductInResults('#main_content > div.section > div > div > ul > li > div.box_prodcut_min.view-first > div.mask > a.box_product_big_btn')
	
}

Then(~'I Select the product') { ->

	clickResultLink('#main_content > div.section > div > div > ul > li > div.box_prodcut_min.view-first > div.mask > a.box_product_big_btn')
	
}

Then(~'I select the first size'){ ->
	genericClickOnElement('#product_detail_sizeContainer > div.size_container.S_M.selected > div:nth-child(1)')
}
Then(~'I add to cart'){ ->
	addToCart()
}

Then(~'I navigate to the PDP of 751302'){ ->
	def urlstring2 = new String()
	urlstring2='http://www.rackroomshoes.com/men-shoes/100727513026/751302.prod?r=10&c=4&orderby=ordate&dir=desc&st=PRODUCT&filter_cat=men-shoes'
	POC.setTesturl(urlstring2)
	to POC
	
}
Then(~'I select the second size'){ ->
	genericClickOnElement('#product_detail_sizeContainer > div.size_container.S_M.selected > div:nth-child(3) > a > span')
}
Then(~'I navigate to cart'){->
	def urlstring3 = new String()
	urlstring3='https://www.rackroomshoes.com/viewCart.html'
	POC.setTesturl(urlstring3)
	to POC
	sleep(5000)
	
}
