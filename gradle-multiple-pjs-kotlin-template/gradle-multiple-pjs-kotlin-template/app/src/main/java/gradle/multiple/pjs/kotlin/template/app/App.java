/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle.multiple.pjs.kotlin.template.app;

import gradle.multiple.pjs.kotlin.template.list.LinkedList;

import static gradle.multiple.pjs.kotlin.template.utilities.StringUtils.join;
import static gradle.multiple.pjs.kotlin.template.utilities.StringUtils.split;
import static gradle.multiple.pjs.kotlin.template.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
