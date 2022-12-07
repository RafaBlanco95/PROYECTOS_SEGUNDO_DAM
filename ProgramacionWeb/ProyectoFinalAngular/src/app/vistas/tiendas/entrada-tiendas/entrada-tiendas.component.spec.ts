import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EntradaTiendasComponent } from './entrada-tiendas.component';

describe('EntradaTiendasComponent', () => {
  let component: EntradaTiendasComponent;
  let fixture: ComponentFixture<EntradaTiendasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EntradaTiendasComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EntradaTiendasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
