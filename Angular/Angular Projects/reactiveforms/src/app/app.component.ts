import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';


@Component({ 
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']

})
export class AppComponent implements OnInit {
    registerForm: FormGroup;
    submitted = false;

    constructor(private formBuilder: FormBuilder) { }

    ngOnInit() {
        this.registerForm = this.formBuilder.group({
            firstName: ['', Validators.required],
            lastName: ['', Validators.required],
            email: ['', [Validators.required, Validators.email, Validators.maxLength(50)]],
            password: ['', [Validators.required, Validators.minLength(6)]],
            confirmPassword: ['', Validators.required]           
        });
		
		/*
		Remaining validators
		class Validators {
			static min(min: number): ValidatorFn
			static max(max: number): ValidatorFn
			static required(control: AbstractControl): ValidationErrors | null
			static requiredTrue(control: AbstractControl): ValidationErrors | null
			static email(control: AbstractControl): ValidationErrors | null
			static minLength(minLength: number): ValidatorFn
			static maxLength(maxLength: number): ValidatorFn
			static pattern(pattern: string | RegExp): ValidatorFn
			static nullValidator(control: AbstractControl): ValidationErrors | null
		*/
    }

    // convenience getter for easy access to form fields
    get f() { return this.registerForm.controls; }

    onSubmit() {
        this.submitted = true;

       
        if (this.registerForm.invalid) {
            return;
        }

        
        alert('SUCCESS!! :-)\n\n' + JSON.stringify(this.registerForm.value, null, 4));
    }

    onReset() {
        this.submitted = false;
        this.registerForm.reset();
    }
}
