CREATE TABLE IF NOT EXISTS livres (
    id SERIAL PRIMARY KEY,
    titre TEXT NOT NULL,
    slug TEXT NOT NULL UNIQUE,
    auteur TEXT NOT NULL,
    annee_parution INTEGER,
    resume TEXT,
    image TEXT
);

INSERT INTO livres (titre, slug, auteur, annee_parution, resume, image)
VALUES
    ('Le petit guide de la vie épicurienne', 'le-petit-guide-de-la-vie-epicurienne', 'Thomas BERTRAND', 2024, 'Ce livre, c''est une déclaration de guerre contre toutes ces conneries que la société nous balance à la figure. Oubliez les régimes, oubliez les règles. Ce qu''il vous faut, c''est savourer la vie comme elle se présente – brutale, délicieuse et sans filtres.', 'lepetitguidedelavieepicurienne.pdf'),
    ('1984', '1984-george-orwell', 'George Orwell', 1949, 'Dans une société totalitaire surveillée en permanence par Big Brother, Winston Smith tente de préserver sa liberté.', '1984.jpg'),
    ('Dune', 'dune-frank-herbert', 'Frank Herbert', 1965, 'Sur la planète désertique Arrakis, Paul Atréides se retrouve au cœur d''enjeux politiques et écologiques autour de l''épice.', 'dune.jpg'),
    ('Le Comte de Monte-Cristo', 'le-comte-de-monte-cristo-alexandre-dumas', 'Alexandre Dumas', 1844, 'Victime d''une machination, Edmond Dantès s''évade du château d''If pour accomplir sa justice.', 'monte-cristo.jpg'),
    ('Fahrenheit 451', 'fahrenheit-451-ray-bradbury', 'Ray Bradbury', 1953, 'Dans un futur où les livres sont interdits et brûlés, un pompier commence à douter de la société.', 'fahrenheit-451.jpg'),
    ('Orgueil et Préjugés', 'orgueil-et-prejuges-jane-austen', 'Jane Austen', 1813, 'Les malentendus et sentiments entre Elizabeth Bennet et Fitzwilliam Darcy dans l''Angleterre rurale.', 'orgueil-et-prejuges.jpg')
ON CONFLICT (slug) DO NOTHING;