package fr.formation.inti.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import fr.formation.inti.model.Astro;
@Component
public class StringValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Astro.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

//		Astro emp = (Astro) target;
//		if (emp.getId() <= 0) {
//			errors.rejectValue("id", "negativeValue", new Object[] { "'id'" }, "id can't be negative");
//		}

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "sun", "sun.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "moon", "moon.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "rising", "rising.required");
		//ValidationUtils.rejectIfEmptyOrWhitespace(errors, "isBG", "isBG.required");
	}


	
}