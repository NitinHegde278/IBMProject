import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ItemDescriptionComponent } from '../item-description/item-description.component';
import { MainPageComponent } from '../main-page/main-page.component';
import { CartComponent } from '../cart/cart.component';
import { WishlistComponent } from '../wishlist/wishlist.component';
import { FrontPageComponent } from '../front-page/front-page.component';
import { SearchComponent } from '../search/search.component';
import { FashionComponent } from '../fashion/fashion.component';
import { EssentialsComponent } from '../essentials/essentials.component';
import { OrdersComponent } from '../orders/orders.component';
import { OtpComponent } from '../otp/otp.component';
import { LoginComponent } from '../login/login.component';
import { SignInComponent } from '../sign-in/sign-in.component';
import { AddProductComponent } from '../add-product/add-product.component';
import { GetAllProductsComponent } from '../get-all-products/get-all-products.component';
import { AdminComponent } from '../admin/admin.component';
import { AccountDetailsComponent } from '../account-details/account-details.component';
import { FaqComponent } from '../faq/faq.component';
import { ContactComponent } from '../contact/contact.component';


// We define the route urls for specific components here
const routes: Routes = [
  // {path: 'urlHere', component: ComponentName}
  {path: 'front', component:FrontPageComponent},
  {path: 'electronics', component: MainPageComponent},
  {path: 'itemDescription/:p1', component: ItemDescriptionComponent},
  {path: 'cart', component: CartComponent},
  {path: 'wishlist', component: WishlistComponent},
  {path: 'search/:p1', component: SearchComponent},
  {path: 'fashion', component: FashionComponent},
  {path: 'essentials', component: EssentialsComponent},
  {path: 'orders', component: OrdersComponent},
  {path: 'otp', component: OtpComponent},
  {path: 'login', component: LoginComponent},
  {path: 'signin', component: SignInComponent},
  {path: 'addproduct', component: AddProductComponent},
  {path: 'getproduct', component: GetAllProductsComponent},
  {path: 'admin', component: AdminComponent},
  {path: 'accountDetails', component: AccountDetailsComponent},
  {path: 'faq', component: FaqComponent},
  {path: 'contact', component: ContactComponent},
  {path:'', redirectTo:'/front', pathMatch:'full'}
];
   
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
