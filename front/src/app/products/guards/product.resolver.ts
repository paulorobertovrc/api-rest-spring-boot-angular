import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, Resolve, RouterStateSnapshot } from '@angular/router';
import Big from 'big.js';
import { of } from 'rxjs';

import { Product } from '../model/product';
import { ProductsService } from '../services/products.service';

@Injectable({
  providedIn: 'root'
})
export class ProductResolver implements Resolve<Product> {
  constructor(private service: ProductsService) {
  }

  resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
    if (route.params && route.params['id']) {
      return this.service.findById(route.params['id']);
    }

    return of({
      id: 0,
      category: '',
      inventory: 0,
      brand: '',
      model: '',
      name: '',
      price: Big(0)
    });
  }
}
