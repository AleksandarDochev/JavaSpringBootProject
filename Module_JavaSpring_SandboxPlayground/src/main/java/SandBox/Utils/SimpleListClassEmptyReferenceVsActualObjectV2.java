package SandBox.Utils;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleListClassEmptyReferenceVsActualObjectV2 {
    /**
     In the addMoreElementsMethodField method, since you don't use the this keyword,
     the Java compiler assumes you are working with the method parameter that you've named List2actualObject.
     Any changes you make inside this method only affect the local parameter, not the class's List2actualObject field.
     In the addMoreElementsClassField method, by using this.List2actualObject, you are explicitly telling Java to use the class's field.
     This ensures that the elements are added to the correct list—the one that belongs to the object instance and not the local variable.
     This example clearly shows why this is a crucial part of the language for avoiding naming conflicts and ensuring you're
     manipulating the correct object's state.
     */
    public List<String> List2actualObject = new ArrayList<>();
    public void addMoreElementsMethodField(List<String> List2actualObject) {
        // This refers to the method's parameter, not the class field.
        //Move your mouse over List2actualObject and see the highlight
        List2actualObject.add("a new element refers to the method's parameter");
    }
    public void addMoreElementsClassField(List<String> List2actualObject) {
        // 'this.List2actualObject' refers to the class's field.
        // The parameter 'List2actualObject' on the right is the local variable.
        //Move your mouse over List2actualObject and see the highlight
        this.List2actualObject.add("a new element refers to the class's field");
    }

}
