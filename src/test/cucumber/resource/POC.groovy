
import java.awt.print.Pageable;

import org.apache.commons.lang3.time.StopWatch
import org.apache.xalan.xsltc.compiler.Import;


import geb.*



public class POC extends Page{
    // String testurl;
	static String someXpath
	static String anotherXpath
	 public String getTesturl() {
		return this.url;
	}
	public static void setTesturl(String testurl) {
		this.url = testurl;
	}
	
	static at = {
	}

	/*  static String getURLstring(){
		 String currentURL= 'https://www.youtube.com/watch?v=97GXQ97rvic' //browser.getCurrentUrl()
		return currentURL
		 //dest.write(closure(browser.getCurrentUrl()))
}*/
	static content = {
		addToCartButton{$('#frmAddToBag > div.add_bag > a')}
		addToCartConfirmation{$('div#cboxLoadedContent>div.pop_up_cont-2>div.pop_up_box-2>a#close-popup.standard-button')}
		productLink { $(someXpath) }
		genericElement{$(anotherXpath)}
		queryInput{$('input#query')}
		queryButton{$('#searchHeader > a')}
		
	}
	void searchForProduct(String queryString) {
		//at some point pass parameter
//		println "Searching for product"
		waitFor {
			queryInput.displayed
		}
		queryInput.value(queryString)
		
		
//		println "Clicking on search button "
		waitFor {
			queryButton.displayed
		}
		queryButton.click()
//		println "Search Button Clicked, verifying at results page "
		
	}
	

	
	void assertProductInResults(String xpathOfSongLink){
//		println "Waiting on product link "+ xpathOfSongLink
		someXpath=xpathOfSongLink
		waitFor {
			productLink.displayed
		}
	}
	void clickResultLink(String xpathOfSongLing){
//		println "Clicking on product link "
		someXpath=xpathOfSongLing
		productLink.click()
	}

	
	void genericClickOnElement(String selector){
//		println "Waiting on Element "+ selector
		anotherXpath=selector
		waitFor {
			genericElement.displayed
		}
//		println "Clicking on Element "
		someXpath=selector
		genericElement.click()
	}
	
	void addToCart(){
		/*Ok, game plan, find cart button, start timer, click cart button, wait for cart confirmation, end timer print.
		 */
		StopWatch stopWatch= new StopWatch();
		System.out.println("STARTING STOPWATCH");
		stopWatch.start();
		addToCartButton.click()
//		println "Clicked on Add to cart "
		waitFor(10, 0.25) {
		addToCartConfirmation
		}
		stopWatch.stop();
		System.out.println("Stopwatch time for Add to Cart " + stopWatch.toString());	
	}

	
}

