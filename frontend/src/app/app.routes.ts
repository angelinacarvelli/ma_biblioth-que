import { Routes } from '@angular/router';

import { LivreListeComponent } from './components/livre-liste/livre-liste';
import { LivreDetailComponent } from './components/livre-detail/livre-detail';
import { LivreIntrouvableComponent } from './components/livre-introuvable/livre-introuvable';

export const routes: Routes = [
  {
    path: '',
    redirectTo: 'livres',
    pathMatch: 'full'
  },
  {
    path: 'livres',
    component: LivreListeComponent
  },
  {
    path: 'livres/:slug',
    component: LivreDetailComponent
  },
  {
    path: '**',
    component: LivreIntrouvableComponent
  }
];
