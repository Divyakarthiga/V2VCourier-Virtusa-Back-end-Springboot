import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {Ng2Webstorage} from 'ngx-webstorage-fix';
import {EditorModule} from '@tinymce/tinymce-angular';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RegisterComponent } from './auth/register/register.component';
import { LoginComponent } from './auth/login/login.component';
import { RegisterSuccessComponent } from './auth/register-success/register-success.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { RouterModule } from '@angular/router';
import { HttpClientModule ,HTTP_INTERCEPTORS} from '@angular/common/http';
import { HomeComponent } from './home/home.component';
import { AddPostComponent } from './add-post/add-post.component';
import { HttpClientInterceptor } from './http-client-interceptor';
import { PostSuccessComponent } from './post-success/post-success.component';
import { ViewPostComponent } from './view-post/view-post.component';
import { AddOrdComponent } from './add-ord/add-ord.component';
import { OrdSuccessComponent } from './ord-success/ord-success.component';
import { DealerLoginComponent } from './dealer-login/dealer-login.component';
import { ViewConsignmentComponent } from './view-consignment/view-consignment.component';
import { AddBranchComponent } from './add-branch/add-branch.component';
import { BranchSuccessComponent } from './branch-success/branch-success.component';
import { ViewBranchComponent } from './view-branch/view-branch.component';
import { AddDeliveryComponent } from './add-delivery/add-delivery.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { ViewDeliveryComponent } from './view-delivery/view-delivery.component';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { AddEmployeeService } from './add-employee.service';
import { ViewEmployeeComponent } from './view-employee/view-employee.component';
import { AddDispatchComponent } from './add-dispatch/add-dispatch.component';
import { ViewDispatchComponent } from './view-dispatch/view-dispatch.component';
import { TrackstatusComponent } from './trackstatus/trackstatus.component';
import { Trackstatus1Component } from './trackstatus1/trackstatus1.component';
import { CustrackComponent } from './custrack/custrack.component';
import { Ctrack1Component } from './ctrack1/ctrack1.component';
import { DealerModuleComponent } from './dealer-module/dealer-module.component';
import { FindOptimizedComponent } from './find-optimized/find-optimized.component';
import { AdminModuleComponent } from './admin-module/admin-module.component';
import { PaymentComponent } from './payment/payment.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    RegisterComponent,
    LoginComponent,
    RegisterSuccessComponent,
    HomeComponent,
    AddPostComponent,
    PostSuccessComponent,
    ViewPostComponent,
    AddOrdComponent,
    OrdSuccessComponent,
    DealerLoginComponent,
    ViewConsignmentComponent,
    AddBranchComponent,
    BranchSuccessComponent,
    ViewBranchComponent,
    AddDeliveryComponent,
    AdminLoginComponent,
    ViewDeliveryComponent,
    AddEmployeeComponent,
    ViewEmployeeComponent,
    AddDispatchComponent,
    ViewDispatchComponent,
    TrackstatusComponent,
    Trackstatus1Component,
    CustrackComponent,
    Ctrack1Component,
    DealerModuleComponent,
    FindOptimizedComponent,
    AdminModuleComponent,
    PaymentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    Ng2Webstorage.forRoot(),
    RouterModule.forRoot(
      [{
        path:'register',component:RegisterComponent
      },
    {
      path:'register-success',component:RegisterSuccessComponent
    },
  {
    path:'login',component:LoginComponent
  },
{
  path:'home',component:HomeComponent
},
{
  path:'add-post',component:AddPostComponent
},
{
  path:'post-success',component:PostSuccessComponent
},
{
  path:'view-post',component:ViewPostComponent
},
{
  path:'ord-success',component:OrdSuccessComponent
},
{
  path:'add-ord',component:AddOrdComponent
},
{
  path:'dealer-module',component:DealerModuleComponent
},
{
path:'find-optimized',component:FindOptimizedComponent
},
{
  path:'dealer-login',component:DealerLoginComponent
},
{
  path:'view-consignment',component:ViewConsignmentComponent
},
{
  path:'branch-success',component:BranchSuccessComponent
},
{
  path:'add-branch',component:AddBranchComponent
},
{
  path:'view-branch',component:ViewBranchComponent
},
{
  path:'add-delivery',component:AddDeliveryComponent
},
{
  path:'ord/:oid',component:AddDeliveryComponent
},
{
  path:'ord1/:oid',component:AddDispatchComponent

},
{
  path:'delivery/:did',component:TrackstatusComponent
},
{
path:'dispatch/:diId',component:Trackstatus1Component
},
{
  path:'dispatch1/:diId',component:Ctrack1Component
},
{
path:'custtracking',component:CustrackComponent
},
{
  path:'view-delivery',component:ViewDeliveryComponent
},
{
  path:'add-employee',component:AddEmployeeComponent
},
{
  path:'view-employee',component:ViewEmployeeComponent
},
{
  path:'add-dispatch',component:AddDispatchComponent
},
{
path:'admin-module',component:AdminModuleComponent
},
{
  path:'view-dispatch',component:ViewDispatchComponent
},
{
  path:'admin-login',component:AdminLoginComponent
},
{
  path:'payment',component:PaymentComponent
}
]
    ),
    HttpClientModule,
    EditorModule
    
  ],
  providers: [{provide:HTTP_INTERCEPTORS, useClass:HttpClientInterceptor,multi:true}],
  bootstrap: [AppComponent]
})
export class AppModule { }
