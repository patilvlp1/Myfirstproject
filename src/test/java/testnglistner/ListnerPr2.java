package testnglistner;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utilitypkg.TakeScreenShotDemo;
public class ListnerPr2 extends ListenerPr1 implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result) {
		//it will give current running method name
		System.out.println("Test Case is::"+result.getName()+" started");	
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TsestCase is::"+result.getName()+"    passed");

	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case is:"+result.getName()+"  failed");
		try {
			TakeScreenShotDemo.captureScreenShot(driver, result.getName());
		}catch(IOException e)
		{
			e.printStackTrace();
		}

	}
	@Override
	public void onTestSkipped(ITestResult result) {


	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {


	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
