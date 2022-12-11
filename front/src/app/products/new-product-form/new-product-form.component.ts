import { Location } from '@angular/common';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

import { ProductsService } from '../services/products.service';

@Component({
  selector: 'app-new-product-form',
  templateUrl: './new-product-form.component.html',
  styleUrls: ['./new-product-form.component.css']
})
export class NewProductFormComponent {
  form: FormGroup;

  constructor(private formBuilder: FormBuilder,
    private service: ProductsService,
    private location: Location
    ) {

      this.form = this.formBuilder.group({
      id: [null],
      category: [null],
      inventory: [null],
      brand: [null],
      model: [null],
      name: [null],
      price: [null]
    });
  }

  onSubmit() {
    this.service.create(this.form.value).subscribe();
    alert('Produto criado com sucesso!');
    this.onCancel();
  }

  onCancel() {
    this.location.back();
  }
}
