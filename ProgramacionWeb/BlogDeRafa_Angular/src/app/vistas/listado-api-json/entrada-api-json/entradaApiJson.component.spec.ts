import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EntradaApiJsonComponent } from './entradaApiJson.component';

describe('EntradaComponent', () => {
  let component: EntradaApiJsonComponent;
  let fixture: ComponentFixture<EntradaApiJsonComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EntradaApiJsonComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EntradaApiJsonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
