import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { NewProductFormComponent } from './new-product-form/new-product-form.component';
import { ProductsComponent } from './products/products.component';

const routes: Routes = [
  { path: '', component: ProductsComponent },
  { path: 'new', component: NewProductFormComponent }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProductsRoutingModule { }
