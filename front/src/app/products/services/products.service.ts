import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import Big from 'big.js';

import { Product } from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  constructor(private httpClient: HttpClient) { }

  findAll(): Product[] {
    return [
      {_id: 1, category: 'Telefonia', inventory: 5, brand: 'Apple', model: '128 GB', name: 'iPhone 14', price: Big(999)}
    ]
  }
}
