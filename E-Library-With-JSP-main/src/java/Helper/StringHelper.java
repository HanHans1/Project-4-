/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

/**
 *
 * @author Reza
 */
public class StringHelper {
    public static String parseLikeQuery(String query) {
        return '%' + query + '%';
    }
}
