import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EntradaCreadoresComponent } from './entrada-creadores.component';

describe('EntradaCreadoresComponent', () => {
  let component: EntradaCreadoresComponent;
  let fixture: ComponentFixture<EntradaCreadoresComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EntradaCreadoresComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EntradaCreadoresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
