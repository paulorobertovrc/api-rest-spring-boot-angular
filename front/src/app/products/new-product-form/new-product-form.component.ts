import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-new-product-form',
  templateUrl: './new-product-form.component.html',
  styleUrls: ['./new-product-form.component.css']
})
export class NewProductFormComponent {
  form: FormGroup;

  constructor(private formBuilder: FormBuilder) {
    this.form = this.formBuilder.group({
      category: [null],
      inventory: [null],
      brand: [null],
      model: [null],
      name: [null],
      price: [null]
    });
  }

  onSubmit() {
    console.log('on submit');
  }

  onCancel() {
    console.log('on cancel');
  }
}
