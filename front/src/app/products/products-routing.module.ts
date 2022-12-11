import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ProductResolver } from './guards/product.resolver';
import { NewProductFormComponent } from './new-product-form/new-product-form.component';
import { ProductsComponent } from './products/products.component';
import { UpdateProductFormComponent } from './update-product-form/update-product-form.component';

const routes: Routes = [
  { path: '', component: ProductsComponent },
  { path: 'new', component: NewProductFormComponent, resolve: { product: ProductResolver } },
  { path: 'update/:id', component: UpdateProductFormComponent, resolve: { product: ProductResolver } }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProductsRoutingModule { }
