package SandBox;

import SandBox.Utils.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "SandBox.Utils")
public class ModuleJavaSpringSandboxPlaygroundApplication {
	private int callCount = 0;
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ModuleJavaSpringSandboxPlaygroundApplication.class, args);



		PrinterCustom myPrinterSpring = context.getBean(PrinterCustom.class);
		PrinterCustom myPrinterJava = new PrinterCustom();
		ArrayStorage arrayBeanTest = context.getBean(ArrayStorage.class);

		//this is regular Java call and data will not be injected
//		Caller objJavaCaller = new Caller();
//		objJavaCaller.method();

		//======this section test Spring vs Java OOP structure
		Caller objSpringCaller = context.getBean(Caller.class);
		objSpringCaller.useArrayStorageFromSpringMethod();//here I call the method that calls th array storage with spring
		objSpringCaller.useArrayStorageFromJavaMethod();




		product ob = new product();
		ob.makeSound();
		System.out.println("callCountArrayStorage:"+arrayBeanTest.callCountArrayStorage);


		System.out.println("--------- SimpleListClassEmptyReferenceVsActualObject test section ------------");
		SimpleListClassEmptyReferenceVsActualObject objSpringSimpleList = context.getBean(SimpleListClassEmptyReferenceVsActualObject.class);
		System.out.println(objSpringSimpleList.List1emptyReference);
		System.out.println(objSpringSimpleList.List2actualObject);


		System.out.println("--------- SimpleListClassEmptyReferenceVsActualObjectV2 test section ------------");
		SimpleListClassEmptyReferenceVsActualObjectV2 objSpringSimpleListV2 = context.getBean(SimpleListClassEmptyReferenceVsActualObjectV2.class);


	}

}
