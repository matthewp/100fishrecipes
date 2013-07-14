ARCHIVE=100fishes.tar.gz

jekyll --no-auto --no-server
tar -cvzf /tmp/$ARCHIVE public/
scp /tmp/$ARCHIVE matthew@$1:/tmp/$ARCHIVE
ssh matthew@$1 'cd /tmp; tar xvf 100fishes.tar.gz; rm -rf ~/www/100fishes; mkdir ~/www/100fishes; mv -f /tmp/public/* ~/www/100fishes'
rm /tmp/$ARCHIVE

