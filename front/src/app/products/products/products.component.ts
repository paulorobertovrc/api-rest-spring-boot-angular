import { Component } from '@angular/core';
import { Observable } from 'rxjs';

import { Product } from '../model/product';
import { ProductsService } from '../services/products.service';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent {

  products: Observable<Product[]>;
  displayedColumns = ['_id', 'category', 'inventory', 'brand', 'model', 'name', 'price'];

  constructor(private productsService: ProductsService) {
    this.products = this.productsService.findAll();
  }
}
