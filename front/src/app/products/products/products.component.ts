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
  displayedColumns = ['id', 'category', 'inventory', 'brand', 'model', 'name', 'price', 'actions'];

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

  onUpdate(product: Product) {
    this.router.navigate(['update', product.id], {relativeTo: this.activeRoute});
  }

  onDelete(product: Product) {
    this.productsService.delete(product.id).subscribe();
    alert('Produto excluído com sucesso!');
    this.products = this.productsService.findAll();
  }
}
