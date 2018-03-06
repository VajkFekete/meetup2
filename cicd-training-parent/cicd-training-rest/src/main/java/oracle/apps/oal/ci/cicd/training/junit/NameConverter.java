/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle.apps.oal.ci.cicd.training.junit;

/**
 *
 * @author vfekete
 */
public class NameConverter {

    public static String camelToUnderscore(String in) {
        StringBuilder out = new StringBuilder();
        for (int i = 1; i < in.length(); i++) {
            if (Character.isUpperCase(in.charAt(i))) {
                if (i != 0) {
                    out.append("_");
                }
                out.append(Character.toLowerCase(in.charAt(i)));
            } else {
                out.append(in.charAt(i));
            }
        }
        return out.toString();
    }
}
