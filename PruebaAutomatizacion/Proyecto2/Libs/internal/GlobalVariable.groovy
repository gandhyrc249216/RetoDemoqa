package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object userid
     
    /**
     * <p></p>
     */
    public static Object AgregarISBN
     
    /**
     * <p></p>
     */
    public static Object ModificarISBN2
     
    /**
     * <p></p>
     */
    public static Object ModificarISBN1
     
    /**
     * <p></p>
     */
    public static Object EliminarISBN
     
    /**
     * <p></p>
     */
    public static Object GETExito
     
    /**
     * <p></p>
     */
    public static Object POSTExito
     
    /**
     * <p></p>
     */
    public static Object DeleteExito
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            userid = selectedVariables['userid']
            AgregarISBN = selectedVariables['AgregarISBN']
            ModificarISBN2 = selectedVariables['ModificarISBN2']
            ModificarISBN1 = selectedVariables['ModificarISBN1']
            EliminarISBN = selectedVariables['EliminarISBN']
            GETExito = selectedVariables['GETExito']
            POSTExito = selectedVariables['POSTExito']
            DeleteExito = selectedVariables['DeleteExito']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
