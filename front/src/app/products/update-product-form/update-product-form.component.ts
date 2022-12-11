import { Location } from '@angular/common';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';

import { Product } from '../model/product';
import { ProductsService } from '../services/products.service';

@Component({
  selector: 'app-update-product-form',
  templateUrl: './update-product-form.component.html',
  styleUrls: ['./update-product-form.component.css']
})
export class UpdateProductFormComponent {
  form: FormGroup;

  constructor(private formBuilder: FormBuilder,
    private service: ProductsService,
    private location: Location,
    private route: ActivatedRoute) {

      this.form = this.formBuilder.group({
      id: [null],
      inventory: [null],
      price: [null]
    });

    const product: Product = this.route.snapshot.data['product'];
    this.form.setValue({
      id: product.id,
      inventory: product.inventory,
      price: product.price
    });
  }

  onSubmit() {
    this.service.update(this.form.value).subscribe();
    console.log(this.form.value)
    alert('Produto alterado com sucesso!');
    this.onCancel();
  }

  onCancel() {
    this.location.back();
  }
}
