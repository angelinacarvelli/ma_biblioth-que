import { Component, OnInit, signal } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ActivatedRoute } from '@angular/router';
import { LivreService } from '../../services/livre.service';

@Component({
  selector: 'app-livre-detail',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './livre-detail.html',
})
export class LivreDetailComponent implements OnInit {

  livre = signal<any>(null);
  introuvable = signal(false);

  constructor(
    private route: ActivatedRoute,
    private livreService: LivreService
  ) {}

  ngOnInit(): void {
    const slug = this.route.snapshot.paramMap.get('slug');

    if (slug) {
      this.livreService.getLivre(slug).subscribe({
        next: (data) => this.livre.set(data),
        error: () => this.introuvable.set(true)
      });
    } else {
      this.introuvable.set(true);
    }
  }
}
