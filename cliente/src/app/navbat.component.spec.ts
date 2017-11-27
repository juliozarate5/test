import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NavbatComponent } from './navbat.component';

describe('NavbatComponent', () => {
  let component: NavbatComponent;
  let fixture: ComponentFixture<NavbatComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NavbatComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NavbatComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
