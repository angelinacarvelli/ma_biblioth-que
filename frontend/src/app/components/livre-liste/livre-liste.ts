import { Component, OnInit, signal } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';
import { LivreService } from '../../services/livre.service';

@Component({
  selector: 'app-livre-liste',
  standalone: true,
  imports: [CommonModule, RouterLink],
  templateUrl: './livre-liste.html',
  styleUrl: './livre-liste.css'
})
export class LivreListeComponent implements OnInit {

  livres = signal<any[]>([]);
  erreur = signal(false);

  constructor(private livreService: LivreService) {}

  ngOnInit(): void {
    this.livreService.getLivres().subscribe({
      next: (data) => this.livres.set(data),
      error: (err) => {
        console.error(err);
        this.erreur.set(true);
      }
    });
  }
}
