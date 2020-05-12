import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing/app-routing.module'; 

import { AppComponent } from './app.component';
import { MainPageComponent } from './main-page/main-page.component';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';
import { HeadingComponent } from './heading/heading.component';
import { ItemDescriptionComponent } from './item-description/item-description.component';
import { TransferService } from './transfer.service';
import { CartComponent } from './cart/cart.component';
import { WishlistComponent } from './wishlist/wishlist.component';
import { FrontPageComponent } from './front-page/front-page.component';
import { SearchComponent } from './search/search.component';
import { FashionComponent } from './fashion/fashion.component';
import { EssentialsComponent } from './essentials/essentials.component';
import { FootingComponent } from './footing/footing.component';
import { OrdersComponent } from './orders/orders.component';
import { OtpComponent } from './otp/otp.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { LoginComponent } from './login/login.component';
import { GetAllProductsComponent } from './get-all-products/get-all-products.component';
import { AdminComponent } from './admin/admin.component';
import { AddProductComponent } from './add-product/add-product.component';
import { AccountDetailsComponent } from './account-details/account-details.component';
import { FaqComponent } from './faq/faq.component';
import { ContactComponent } from './contact/contact.component';

@NgModule({
  declarations: [
    AppComponent,
    MainPageComponent,
    HeadingComponent,
    ItemDescriptionComponent,
    CartComponent,
    WishlistComponent,
    FrontPageComponent,
    SearchComponent,
    FashionComponent,
    EssentialsComponent,
    FootingComponent,
    OrdersComponent,
    LoginComponent,
    OtpComponent,
    SignInComponent,
    AddProductComponent,
    GetAllProductsComponent,
    AdminComponent,
    AccountDetailsComponent,
    FaqComponent,
    ContactComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [
    TransferService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
