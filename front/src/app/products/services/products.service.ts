import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { Product } from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  private readonly url = 'api/product';

  constructor(private httpClient: HttpClient) { }

  create(product: Product) {
    return this.httpClient.post<Product>(this.url, product);
  }

  findAll() {
    return this.httpClient.get<Product[]>(this.url);
  }

  findById(id: number) {
    return this.httpClient.get<Product>(`${this.url}/${id}`);
  }

  update(product: Product) {
    return this.httpClient.put<Product>(`${this.url}/${product.id}`, product);
  }

  delete(id: number) {
    return this.httpClient.delete(`${this.url}/${id}`);
  }
}
