import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { catchError, Observable, of } from 'rxjs';

import { Product } from '../model/product';
import { ProductsService } from '../services/products.service';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent {

  products: Observable<Product[]>;
  displayedColumns = ['_id', 'category', 'inventory', 'brand', 'model', 'name', 'price', 'actions'];

  constructor(private productsService: ProductsService, private router: Router, private activeRoute: ActivatedRoute) {
    this.products = this.productsService.findAll()
                  .pipe(
                    catchError(err => {
                      alert('Unable to connect to the server');
                      return of([])
                    })
                  );
  }

  onAdd() {
    this.router.navigate(['new'], {relativeTo: this.activeRoute});
  }
}
