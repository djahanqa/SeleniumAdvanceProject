package listener;

import base.ScriptBase;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listener extends ScriptBase implements ITestListener  {

    private static String getTestMethodName(ITestResult iTestResult){
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    public void onTestStart(ITestResult iTestResult) {
        System.out.println("I am in ontTestStart"+getTestMethodName(iTestResult)+" Start");

    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("I am in ontTestSuccess"+getTestMethodName(iTestResult)+" Succeed");

    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("I am in ontTestFailutre"+getTestMethodName(iTestResult)+" Failed");

    }

    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("I am in ontTestSkipped"+getTestMethodName(iTestResult)+" Skipped");

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("I am in onFailedButWithinSuccessPercentage"+getTestMethodName(iTestResult)+" FailedButWithinSuccessPercentage");

    }

    public void onStart(ITestContext iTestContext) {
        System.out.println("I am in onStart"+iTestContext.getName());

    }

    public void onFinish(ITestContext iTestContext) {
        System.out.println("I am in onFinish"+iTestContext.getName());

    }

}
