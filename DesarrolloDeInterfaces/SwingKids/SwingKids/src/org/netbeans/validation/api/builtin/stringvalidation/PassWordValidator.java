
package org.netbeans.validation.api.builtin.stringvalidation;

import org.netbeans.validation.api.Problems;
import org.openide.util.NbBundle;


public class PassWordValidator extends StringValidator{
    
    
    public boolean checkValidPassword(char[] password)
    {
        int u = 0, l = 0, d = 0, sp = 0;
        //This function returns different values based on what is missing in the parameter 'password'
        if(password.length < 8)
        {
            return false;
        }
        for(int i = 0; i < password.length; i++)
        {
            char c = password[i];
            if(Character.isUpperCase(c))
            {
                u = 1;
            }
            else if(Character.isLowerCase(c))
            {
                l = 1;
            }
            else if(Character.isDigit(c))
            {
                d = 1;
            }
            if(!Character.isLetter(c) && !Character.isDigit(c) && !Character.isWhitespace(c))
            {
                sp = 1;
            }
        }
        if(u == 1 && l == 1 && d == 1 && sp == 1)
        {
            return true;
        }
        return false;
    }
    @Override
    public void validate(Problems problems, String compName, String model){
        if(!checkValidPassword(model.toCharArray())){
            String message= NbBundle.getMessage(PassWordValidator.class, "PASS_LENGTH",compName);
            problems.add(message);
        }
}
}
