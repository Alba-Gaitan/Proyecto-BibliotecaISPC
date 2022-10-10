import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { HeaderComponent } from './header/header.component';
import { NosotrosComponent } from './nosotros/nosotros.component';
import { CatalogoComponent } from './catalogo/catalogo.component';
import { FooterComponent } from './footer/footer.component';
import { LoginComponent } from './login/login.component';
import { InicioComponent } from './inicio/inicio.component';
import { ReservasComponent } from './reservas/reservas.component';
import { RegistroComponent } from './registro/registro.component';

const rutas: Routes=[
  
  {path:'', 
  pathMatch: 'full',
  redirectTo: 'inicio'
  },
  {path:'inicio', 
  component:InicioComponent
  },
  {path:'catalogo', 
  component:CatalogoComponent
  },
  {path:'nosotros', 
  component:NosotrosComponent
  },
  {path:'login', 
  component:LoginComponent
  },
  {path: 'reservas',
  component: ReservasComponent
},


];


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HeaderComponent,
    NosotrosComponent,
    CatalogoComponent,
    FooterComponent,
    LoginComponent,
    InicioComponent,
    ReservasComponent,
    RegistroComponent,
  ],

  imports: [
    BrowserModule,
    RouterModule.forRoot(rutas,{
      enableTracing: true,
      paramsInheritanceStrategy: 'always',
      useHash: true,

    })
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

