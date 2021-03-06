package think.rpgitems.commands;

import org.librazy.nyaautils_lang_checker.LangKey;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Validator {
    String value();

    @LangKey String message();
}
