import { BowlingstatsuiPage } from './app.po';

describe('bowlingstatsui App', function() {
  let page: BowlingstatsuiPage;

  beforeEach(() => {
    page = new BowlingstatsuiPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
