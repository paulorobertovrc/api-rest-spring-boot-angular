import { Component } from '@angular/core';

import { Product } from '../model/product';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent {

  products: Product[] = [
  ];
  displayedColumns = ['_id', 'category', 'inventory', 'brand', 'model', 'name', 'price'];
}
